public record Town(String name, int distanceFromSydney) {
    @Override
    public String toString() {
        return String.format("%s (%d)",name,distanceFromSydney);
    }
}
