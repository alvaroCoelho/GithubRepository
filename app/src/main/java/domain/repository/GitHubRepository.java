package domain.repository;

import androidx.databinding.library.baseAdapters.BuildConfig;

import java.util.List;
import java.util.concurrent.TimeUnit;

import data.GitHubService;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GitHubRepository {

   private GitHubService gitHubService =   new Retrofit.Builder()
          // .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(  new OkHttpClient()
            .newBuilder()
            .connectTimeout(60L, TimeUnit.SECONDS)
            .readTimeout(60L, TimeUnit.SECONDS)
             .build())
            .build()
            .create(GitHubService.class);


    public List<String> get(){
        return gitHubService.get();
    }


}
