package com.youtube.clone.video;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VideoModel {
	private String videoId;
	private String title;
	private String description;
	private String thumbnailUrl;
	private Long uploadDate;
	private Long viewCount;
	private String channelId;
	private String duration;
	
}
