public record Valor(double base_value, double conversion_result, String base_code, String target_code) {
    @Override
    public String toString() {
        return "O valor convertido de " + base_value +" [" + base_code + "]"+" ==>> " +
                conversion_result + " [" + target_code + "]";
    }
}
