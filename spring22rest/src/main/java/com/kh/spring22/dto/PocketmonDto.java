package com.kh.spring22.dto;

import javax.validation.constraints.Pattern;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "포켓몬스터")
@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class PocketmonDto {
	
	@Schema(description = "몬스터번호(등록시x)")
	private int no;
	
	@Pattern(regexp = "[가-힣]+")
	@Schema(description = "몬스터이름", nullable = false, example = "잠만보")
	private String name;
	
	@Schema(description = "몬스터 속성", allowableValues = {"풀", "불", "물","전기","잠","무속성"},
					nullable = false, example = "잠")
	private String type;
	
	@Schema(hidden = true)//문서에서 empty를 없애는
	public boolean isEmpty() {
		return no == 0 && name == null && type == null;
	}

}
