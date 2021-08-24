
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
//import org.apache.hc.core5.http.ParseException;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Get {
    static String sUrl = "https://speller.yandex.net/services/spellservice/checkText?text=Это+предадущий+примир";
    public static void main(String[] args) {
        CloseableHttpResponse resp1=null;
        try {

            CloseableHttpClient httpClient= HttpClients.createDefault();

HttpGet httpGet=new HttpGet(sUrl);
            resp1= httpClient.execute(httpGet);

            System.out.println(EntityUtils.toString(resp1.getEntity()));
        } catch (IOException e) {
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


