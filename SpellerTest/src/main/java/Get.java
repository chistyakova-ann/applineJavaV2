import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;

import java.io.IOException;

public class Get {
    static String sUrl = "https://speller.yandex.net/services/spellservice";
    public static void main(String[] args) {
        CloseableHttpResponse resp1=null;
        try {

            CloseableHttpClient httpClient= HttpClients.createDefault();
            HttpGet httpGet=new HttpGet(sUrl+ "/checkText?text=Апасность+мое+второе+имя+Это+из+прошлага+примери");

            resp1= httpClient.execute(httpGet);
            System.out.println(EntityUtils.toString(resp1.getEntity()));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        } finally {
            try {
                resp1.close();
            }catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}


