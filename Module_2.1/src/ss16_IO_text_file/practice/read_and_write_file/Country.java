package ss16_IO_text_file.practice.read_and_write_file;

public class Country {
    private int stt;
    private String code;
    private String name;

    public Country() {
    }

    public Country(int stt, String code, String name) {
        this.stt = stt;
        this.code = code;
        this.name = name;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "stt=" + stt +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
