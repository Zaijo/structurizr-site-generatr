package nl.avisi.structurizr.site.generatr.site.model

import nl.avisi.structurizr.site.generatr.site.GeneratorContext

class HeaderBarViewModel(pageViewModel: PageViewModel, generatorContext: GeneratorContext) {
    val titleLink = LinkViewModel(pageViewModel, generatorContext.workspace.name, HomePageViewModel.url())
    val branches = generatorContext.branches
        .map { BranchHomeLinkViewModel(pageViewModel, it) }
    val currentBranch = generatorContext.currentBranch
    val version = generatorContext.version
}
