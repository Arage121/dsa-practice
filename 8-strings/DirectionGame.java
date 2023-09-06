//https://www.codingninjas.com/studio/contests/weekend-contest-89/9333824/problems/27104
public class DirectionGame {
        static String directionGame(int n, String s) {
            char direction = 'N'; // Start facing North
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    // Clockwise turn
                    switch (direction) {
                        case 'N':
                            direction = 'E';
                            break;
                        case 'E':
                            direction = 'S';
                            break;
                        case 'S':
                            direction = 'W';
                            break;
                        case 'W':
                            direction = 'N';
                            break;
                    }
                } else {
                    // Counterclockwise turn
                    switch (direction) {
                        case 'N':
                            direction = 'W';
                            break;
                        case 'E':
                            direction = 'N';
                            break;
                        case 'S':
                            direction = 'E';
                            break;
                        case 'W':
                            direction = 'S';
                            break;
                    }
                }
            }
            return (direction == 'N') ? "NORTH" : (direction == 'E') ? "EAST" : (direction == 'S') ? "SOUTH" : "WEST";
        }
}
