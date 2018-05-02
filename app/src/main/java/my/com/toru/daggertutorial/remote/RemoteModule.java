package my.com.toru.daggertutorial.remote;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Singleton
@Module
public class RemoteModule {

    public RemoteModule() {}

    @Provides
    OkHttpClient getClient(){
        return new OkHttpClient.Builder()
                .connectTimeout(5000, TimeUnit.MICROSECONDS)
                .readTimeout(5000, TimeUnit.MICROSECONDS)
                .writeTimeout(5000, TimeUnit.MICROSECONDS)
                .build();
    }

    @Provides
    Retrofit getRetrofit(OkHttpClient client){
        return new Retrofit.Builder().baseUrl("http://www.google.com")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}