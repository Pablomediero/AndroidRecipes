package com.hiberus.receptom.domain.usecase.recipe

import com.hiberus.receptom.domain.repository.RecipeRepository
import com.hiberus.receptom.model.local.Recipe

class GetAllRecipesUseCase(
    private val recipeRepository: RecipeRepository
) {
    fun execute(): List<Recipe>{
        return recipeRepository.getAllRecipe()
    }
}