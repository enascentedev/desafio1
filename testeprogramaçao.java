
import java.io.IOException; 
import java.net.URI; 
import java.net.http.HttpClient; 
import java.net.http.HttpRequest; 
import java.net.http.HttpResponse; 
import java.net.http.HttpResponse.BodyHandlers; 
import java.util.Scanner; 

public class testeprogramaçao { 

    public static void main(String[] args) 
        throws IOException, InterruptedException { 
    Scanner scanner = new Scanner(System.in); 
    System.out.print("Digite o numero do fact: "); 
    int fact = scanner.nextInt(); 

    HttpRequest request = HttpRequest 
    .newBuilder() 
    .GET() 
    .uri( 
    URI.create( 
    "https://www.dogfactsapi.ducnguyen.dev/api/v1/facts/number=" + fact ) ) 
    .build(); 
    HttpClient httpClient = HttpClient.newBuilder().build(); 
    HttpResponse<String> response = httpClient.send( 
    request, 
    BodyHandlers.ofString() 
    ); 
       System.out.println(response.body()); 
    scanner.close(); 
    } 
}