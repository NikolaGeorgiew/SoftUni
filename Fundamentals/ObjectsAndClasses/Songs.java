package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    static class Song {
        private String typeList;
        private String name;
        private String time;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }
        public String getTypeList() {
            return  this.typeList;
        }
        public void setTime(String time) {
            this.time = time;
        }

        public String getTime() {
            return this.time;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Song> listSongs = new ArrayList<>();

        int n = Integer.parseInt (scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String[] inputSong = scanner.nextLine().split("_");

            String type = inputSong[0];
            String name = inputSong[1];
            String time = inputSong[2];

            Song song = new Song();

            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);
            listSongs.add(song);

        }
        String command = scanner.nextLine();
        if (command.equals("all")){
            for (Song item : listSongs) {
                System.out.println(item.getName());
            }
        } else {
            for (Song item : listSongs) {
                if (item.getTypeList().equals(command)) {
                    System.out.println(item.getName());
                }
            }
        }
    }
}
