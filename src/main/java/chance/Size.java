package chance;

public enum Size {
    S("Small"), M("Medium"), L("Large");

    private final String sizeName;

    private Size (String sizeName){
        this.sizeName = sizeName;
    }

    public String getSizeName() {
        return sizeName;
    }
}
