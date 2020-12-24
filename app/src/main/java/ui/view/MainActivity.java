package ui.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import com.example.githubrepoitory.R;

import java.util.List;



public class MainActivity extends AppCompatActivity {
    //private Git  GitHubRepositoryViewModel repositoryViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // repositoryViewModel.getAll();
    }

  /*  private void setUpObserver(){

        repositoryViewModel.repositories.observe(this, new Observer<List<RepositoryModel>>() {
            @Override
            public void onChanged(List<RepositoryModel> repositoryModels) {

                //atualizações adapter

            }
        });

    }
*/
}