package com.social.pet.socialPet.http;
        import java.io.IOException;
        import java.net.URI;
        import java.net.URISyntaxException;

        import org.apache.http.HttpEntity;
        import org.apache.http.HttpResponse;
        import org.apache.http.client.HttpClient;
        import org.apache.http.client.methods.HttpPost;
        import org.apache.http.client.utils.URIBuilder;
        import org.apache.http.entity.StringEntity;
        import org.apache.http.impl.client.DefaultHttpClient;
        import org.apache.http.util.EntityUtils;
        import org.json.JSONArray;


public class ChamadaHttp {
    public Boolean chamada(String base64) throws URISyntaxException, IOException {
        HttpClient httpclient = new DefaultHttpClient();
        URIBuilder builder = new URIBuilder("https://vision.googleapis.com/v1/images:annotate?key=AIzaSyB6cBEzNkKrb5rArVvtMkaCp4FXRDF9eDg");
        String body ="{\"requests\":[{\"image\":{\"content\":\""+base64+"\"},\"features\": [{\"type\":\"LABEL_DETECTION\"}]}]}";
        URI uri = builder.build();
        HttpPost request = new HttpPost(uri);

        request.setHeader("Content-Type", "application/json");

        StringEntity reqEntity = new StringEntity(body);
        request.setEntity(reqEntity);


        HttpResponse response = httpclient.execute(request);
        response.getStatusLine().getStatusCode();
        HttpEntity entity = response.getEntity();


        String jsonString = EntityUtils.toString(entity);
        JSONArray jsonArray = new JSONArray("["+jsonString+"]");

        System.out.println(jsonArray);

        JSONArray responses = jsonArray.getJSONObject(0).getJSONArray("responses");
        JSONArray labelAnnotations = responses.getJSONObject(0).getJSONArray("labelAnnotations");
        boolean status = false;
        for(int i = 0; i< labelAnnotations.length(); i++) {
            String nome = labelAnnotations.getJSONObject(i).getString("description");
            if(nome.equals("Dog")|| nome.equals("Cat") || nome.equals("Turtle") || nome.equals("Bird")){
                status = true;
            }
        }
        return status;
    }
}
