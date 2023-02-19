package oop;

public class Com {

    public static String aa;

    private String mainBoard;
    private String cpu;
    private String gpu;
    private String ram;

    public void print(){
        System.out.println(this.mainBoard);
        System.out.println(this.cpu);
        System.out.println(this.gpu);
        System.out.println(this.ram);
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
}
