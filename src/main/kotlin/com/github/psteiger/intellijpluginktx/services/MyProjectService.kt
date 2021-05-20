package com.github.psteiger.intellijpluginktx.services

import com.github.psteiger.intellijpluginktx.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
