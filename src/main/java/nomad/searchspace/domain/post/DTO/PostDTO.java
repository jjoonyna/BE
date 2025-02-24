package nomad.searchspace.domain.post.DTO;


import lombok.*;

import nomad.searchspace.domain.post.entity.PostType;
import java.util.List;

@Data
@Builder
public class PostDTO {
    private String title;
    private String content;
    private String address;
    private PostType type;
    private double latitude;
    private double longitude;
    private String phoneNumber;
    private String businessHours;
    private String holidays;
    private String url;
    private boolean copyright;
    private boolean approval;
}