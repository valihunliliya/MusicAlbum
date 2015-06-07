package ParsingJason;

import java.util.Comparator;

public class ComparatorClass implements Comparator<AlbumDTO> {

    @Override
    public int compare(AlbumDTO song1, AlbumDTO song2) {
        int flag = song1.getSongname().compareTo(song2.getSongname());
        if(flag == 0) flag = song1.getAuthor().compareTo(song2.getAuthor());
        if (flag == 0) flag = song2.getDuration() - song1.getDuration();
        return flag;
    }

}