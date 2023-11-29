import java.io.File;
import java.io.IOException;

public class FileExplorer {

    private File currentDirectory;

    public FileExplorer() {
        this.currentDirectory = new File(".");
    }

    public void pwd() {
        System.out.println(currentDirectory.getAbsolutePath());
    }

    public void ls() {
        for (File file : currentDirectory.listFiles()) {
            System.out.println(file.getName());
        }
    }

    public void cd(String path) throws IOException {
        File newDirectory = new File(path);
        if (!newDirectory.exists()) {
            throw new IOException("Diretório não existe");
        }
        currentDirectory = newDirectory;
    }

    public void mkdir(String name) throws IOException {
        File newDirectory = new File(currentDirectory, name);
        if (newDirectory.exists()) {
            throw new IOException("Diretório já existe");
        }
        newDirectory.mkdir();
    }

    public void rm(String name) throws IOException {
        File file = new File(currentDirectory, name);
        if (!file.exists()) {
            throw new IOException("Arquivo não existe");
        }
        if (file.isDirectory()) {
            rmdir(name);
        } else {
            file.delete();
        }
    }

    private void rmdir(String name) throws IOException {
        File directory = new File(currentDirectory, name);
        if (!directory.isDirectory()) {
            throw new IOException("O caminho especificado não é um diretório");
        }
        for (File file : directory.listFiles()) {
            if (file.isDirectory()) {
                rmdir(file.getName());
            } else {
                file.delete();
            }
        }
        directory.delete();
    }

    public static void main(String[] args) throws IOException {
        FileExplorer explorer = new FileExplorer();
        while (true) {
            System.out.print(">>> ");
            String command = System.console().readLine();
            String[] tokens = command.split(" ");
            switch (tokens[0]) {
                case "pwd":
                    explorer.pwd();
                    break;
                case "ls":
                    explorer.ls();
                    break;
                case "cd":
                    explorer.cd(tokens[1]);
                    break;
                case "mkdir":
                    explorer.mkdir(tokens[1]);
                    break;
                case "rm":
                    explorer.rm(tokens[1]);
                    break;
                default:
                    System.out.println("Comando não reconhecido");
            }
        }
    }
}
