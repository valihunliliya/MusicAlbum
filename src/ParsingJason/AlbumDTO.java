package ParsingJason;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AlbumDTO {

	private String author;
	private String songname;
	private Integer duration;

	@JsonCreator
	public AlbumDTO(@JsonProperty("author") String author,
			@JsonProperty("songname") String songname,
			@JsonProperty("duration") Integer duration) {
		this.author = author;
		this.songname = songname;
		this.duration = duration;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSongname() {
		return songname;
	}

	public void setSongname(String songname) {
		this.songname = songname;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "AlbumDTO [author=" + author + ", songname=" + songname
				+ ", duration=" + duration + "]";
	}

}
