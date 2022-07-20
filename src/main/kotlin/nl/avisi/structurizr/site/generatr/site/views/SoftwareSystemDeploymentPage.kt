package nl.avisi.structurizr.site.generatr.site.views

import kotlinx.html.HTML
import nl.avisi.structurizr.site.generatr.site.model.SoftwareSystemDeploymentPageViewModel

fun HTML.softwareSystemDeploymentPage(viewModel: SoftwareSystemDeploymentPageViewModel) {
    softwareSystemPage(viewModel) {
        viewModel.diagrams.forEach {
            diagram(it)
        }
    }
}
