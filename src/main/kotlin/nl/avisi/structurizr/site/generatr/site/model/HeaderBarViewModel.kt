package nl.avisi.structurizr.site.generatr.site.model

import nl.avisi.structurizr.site.generatr.site.GeneratorContext

class HeaderBarViewModel(pageViewModel: PageViewModel, generatorContext: GeneratorContext) {
    val logo = logoPath(generatorContext)?.let { ImageViewModel(pageViewModel, "/$it") }
    val hasLogo = logo != null
    val titleLink = LinkViewModel(pageViewModel, generatorContext.workspace.name, HomePageViewModel.url())
    val branches = generatorContext.branches
        .map { BranchHomeLinkViewModel(pageViewModel, it) }
    val currentBranch = generatorContext.currentBranch
    val version = generatorContext.version

    private fun logoPath(generatorContext: GeneratorContext) =
        generatorContext.workspace.views.configuration.properties
            .getOrDefault(
                "structurizr.style.logo.path",
                null
            )
}
