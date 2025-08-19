package org.demo.Builder;

public class ReaderSettings {
    private String theme;
    private int fontSize;
    private double lineSpacing;
    private ReaderSettings(Builder builder) {
        this.theme = builder.theme;
        this.fontSize = builder.fontSize;
        this.lineSpacing = builder.lineSpacing;
    }

    public static class Builder {
        private String theme = "Light";
        private int fontSize = 12;
        private double lineSpacing = 1.5;

        public Builder theme(String theme) {
            this.theme = theme;
            return this;
        }
        public Builder fontSize(int fontSize) {
            this.fontSize = fontSize;
            return this;
        }
        public Builder lineSpacing(double lineSpacing) {
            this.lineSpacing = lineSpacing;
            return this;
        }
        public ReaderSettings build() {
            return new ReaderSettings(this);
        }
    }
}
