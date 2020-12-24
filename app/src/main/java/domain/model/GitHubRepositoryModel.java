package domain.model;

public class GitHubRepositoryModel {

    public String name;
    public String description;
    public String URLAvatar;

    public GitHubRepositoryModel(String name, String description, String URLAvatar) {
        this.name = name;
        this.description = description;
        this.URLAvatar = URLAvatar;
    }
}
