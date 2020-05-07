package org.kotlinhyd.petstore.handlers

import org.kotlinhyd.petstore.dto.PetsDto
import org.kotlinhyd.petstore.repository.PetRepo
import org.springframework.stereotype.Component
import org.springframework.web.servlet.function.ServerRequest
import org.springframework.web.servlet.function.body

@Component
class PetHandler(val petRepo: PetRepo) {
    fun newPet(request: ServerRequest): PetsDto {
        return request.body()
    }
}