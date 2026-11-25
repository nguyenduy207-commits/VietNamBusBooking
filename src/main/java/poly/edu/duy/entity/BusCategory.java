package poly.edu.duy.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BusCategory {
	private Integer id;
	private String name;
	private String description;
	private Boolean active = true;
	private LocalDateTime createdAt = LocalDateTime.now();
	private List<BusRoute> routes = new ArrayList<>();
}
