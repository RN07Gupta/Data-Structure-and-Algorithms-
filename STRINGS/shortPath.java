
class shortPath {
    public static void main(String[] args) {

        int x = 0, y = 0;
        String path = "WNEENESENNN";

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            }
        }

        double shortest = Math.sqrt(x * x + y * y);
        System.out.println("Shortest Path Distance = " + shortest);
    }
}
