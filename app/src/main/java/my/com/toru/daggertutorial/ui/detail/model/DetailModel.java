package my.com.toru.daggertutorial.ui.detail.model;

/*
*
* Model is NOT POJO. This can be described as Business Logic rather.
* DetailModel class consists of query string and result from retrofit, for example.
* */
public class DetailModel {
    private boolean isLoading;
    private String result;

    public DetailModel(boolean isLoading, String result) {
        this.isLoading = isLoading;
        this.result = result;
    }

    public boolean isLoading() {
        return isLoading;
    }

    public String getResult() {
        return result;
    }
}