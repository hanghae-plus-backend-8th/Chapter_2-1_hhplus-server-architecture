package kr.hhplus.be.server.product;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@ArraySchema(schema = @Schema(type = "array", description = "상위 상품 리스트 응답"))
public class TopProductResponse {

    @Schema(description = "랭크", type = "integer", example = "1")
    private int rank;

    @Schema(description = "상품 ID", type = "integer", format = "int64", example = "1")
    private long productId;

    @Schema(description = "상품명", type = "string", example = "에어맥스")
    private String name;

    @Schema(description = "가격", type = "integer", format = "int64", example = "5000")
    private long price;

    @Schema(description = "수량", type = "integer", format = "int64", example = "10")
    private int quantity;
}
