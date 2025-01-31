package nl.avisi.structurizr.site.generatr.site.views

import kotlinx.html.HTML
import nl.avisi.structurizr.site.generatr.site.model.SoftwareSystemDecisionsPageViewModel

fun HTML.softwareSystemDecisionsPage(viewModel: SoftwareSystemDecisionsPageViewModel) {
    if (viewModel.visible)
        softwareSystemPage(viewModel) {
            table(viewModel.decisionsTable)
        }
    else
        redirectUpPage()
}
