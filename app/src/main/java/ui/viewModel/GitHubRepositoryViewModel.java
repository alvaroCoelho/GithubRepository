package ui.viewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import domain.repository.*;

import java.util.List;


public class GitHubRepositoryViewModel extends ViewModel {

      public MutableLiveData<List<GitHubRepositoryViewModel>> repositories;
      private GitHubRepository gitHubRepository;
    public void getAll(){
      //  repositories.setValue();


           // repositories.setValue(gitHubRepository.get);

         ;
    }




}
