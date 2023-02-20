package com.mayab.desarrollo.creacional.builder;

public class Laptop {
    private String ssd;
    private String ram;
    private String cpu;
    private String kb;
    private String os;

    public String getSsd() {
        return ssd;
    }

    public String getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    public String getKb() {
        return kb;
    }

    public String getOs() {
        return os;
    }

    private Laptop(LaptopBuilder lB){
        this.ssd = lB.ssd;
        this.cpu = lB.cpu;
        this.ram = lB.ram;
        this.kb = lB.kb;
        this.os = lB.os;
    }

    @Override
    public String toString() {
        return "The laptop has:" +
                "\nCPU: " +this.cpu +
                "\nRAM: " + this.ram +
                "\nSSD: " + this.ssd +
                "\nOS: " + this.os +
                "\nKB: " + this.kb;
    }

    public static class LaptopBuilder{
        private String ssd;
        private String ram;
        private String cpu;
        private String kb;
        private String os;

        public static LaptopBuilder LaptopBuilder() {
            return new LaptopBuilder();
        }

        public LaptopBuilder setSsd(String ssd) {
            this.ssd = ssd;
            return this;
        }

        public LaptopBuilder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public LaptopBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public LaptopBuilder setKb(String kb) {
            this.kb = kb;
            return this;
        }

        public LaptopBuilder setOs(String os) {
            this.os = os;
            return this;
        }
        public Laptop build(){
            return new Laptop(this);
        }

    }

}
