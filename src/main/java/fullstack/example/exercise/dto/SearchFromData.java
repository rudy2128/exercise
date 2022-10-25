package fullstack.example.exercise.dto;

public class SearchFromData {
    private String keyword;

    public SearchFromData(String keyword) {
        this.keyword = keyword;
    }

    public SearchFromData() {
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
