package sg.edu.rp.c346.id22023330.demoandroidlist;

public class AndroidVersion {

    private String name;
    private String version;

    public AndroidVersion(String name, String version) {
        this.version = version;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
//        return "AndroidVersion{" +
//                "name='" + name + '\'' +
//                ", version='" + version + '\'' +
//                ')';
        return name + ": " + version;
    }
}
