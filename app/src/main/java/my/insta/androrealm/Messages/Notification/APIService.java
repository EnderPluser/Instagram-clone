package my.insta.androrealm.Messages.Notification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAANc8RTRM:APA91bFQdGgUlBnJU9YAT16dZ05SR8zfqg2wBHvVZypRBcGODLrZoV3aPRHSDRLqS1G3NQ6UxI4qajDxlL-jjO1gW78QIiFj6x5IB6waqP7e2kjvY16o4I6K5T0V5ys1kgF0GCh3bLQJ"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);


}
