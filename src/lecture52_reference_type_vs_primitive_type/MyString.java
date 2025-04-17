package lecture52_reference_type_vs_primitive_type;

public class MyString {
    private char[] chars;

    public void setText(char[] chars) {
        this.chars = chars;
    }

    public String getText() {
        String text = "";
        for (int i = 0; i < this.chars.length; i++) {
            text = text + this.chars[i];
        }

        return text;
    }

    public int length() {
        return chars.length;
    }

    public boolean contains(char character) {
        for (int i = 0; i < this.chars.length; i++) {
            if (this.chars[i] == character) {
                return true;
            }
        }
        return false;
    }
}
