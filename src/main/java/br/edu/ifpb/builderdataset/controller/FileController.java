package br.edu.ifpb.builderdataset.controller;

import br.edu.ifpb.builderdataset.abstraction.FileService;
import br.edu.ifpb.builderdataset.service.FileServiceImpl;

import java.io.File;
import java.util.Set;

public class FileController {

    private FileService fileService;

    public FileController() {
        this.fileService = new FileServiceImpl();
    }

    public File[] getFiles(File dir) {
        return this.fileService.getFiles(dir);
    }

    public String readContentFile(File file) {
        return this.fileService.readContentFile(file);
    }

    public Set<String> readContentFileAsList(File file) {
        return this.fileService.readContentFileAsList(file);
    }

    public void deleteDir(File dir) {
        this.fileService.deleteDir(dir);
    }

    public void writeContentFile(File file, String text) {
        fileService.writeContentFile(file, text);
    }

}
