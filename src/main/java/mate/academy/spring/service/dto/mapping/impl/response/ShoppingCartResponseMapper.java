package mate.academy.spring.service.dto.mapping.impl.response;

import mate.academy.spring.model.ShoppingCart;
import mate.academy.spring.model.dto.response.ShoppingCartResponseDto;
import mate.academy.spring.service.dto.mapping.DtoResponseMapper;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCartResponseMapper implements DtoResponseMapper<ShoppingCartResponseDto,
        ShoppingCart> {
    @Override
    public ShoppingCartResponseDto toDto(ShoppingCart shoppingCart) {
        ShoppingCartResponseDto shoppingCartResponseDto = new ShoppingCartResponseDto();
        shoppingCartResponseDto.setId(shoppingCart.getId());
        shoppingCartResponseDto.setTickets(shoppingCart.getTickets());
        shoppingCartResponseDto.setUser(shoppingCart.getUser());
        return shoppingCartResponseDto;
    }
}
