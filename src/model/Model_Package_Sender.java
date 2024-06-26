
package model;

public class Model_Package_Sender {


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getFileID() {
        return fileID;
    }

    public void setFileID(int fileID) {
        this.fileID = fileID;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public Model_Package_Sender(int fileID, String fileName, byte[] data, boolean finish) {
        this.fileID = fileID;
        this.fileName = fileName;
        this.data = data;
        this.finish = finish;
    }

    public Model_Package_Sender() {
    }

    private int fileID;
    private String fileName;
    private byte[] data;
    private boolean finish;
}
