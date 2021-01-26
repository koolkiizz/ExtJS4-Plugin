package com.github.koolkiizz.extjs4plugin.services

import com.github.koolkiizz.extjs4plugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
