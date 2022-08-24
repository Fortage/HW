package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        UsersRepositoryFileImpl repositoryFile = new UsersRepositoryFileImpl();
        List<User> users= new ArrayList<>();
        String[] params;
        File file = new File("src/com/company/file.txt");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);

            params = line.split("\\|");
            users.add(new User(Integer.parseInt(params[0]), params[1], params[2], Integer.parseInt(params[3]), Boolean.getBoolean(params[4])));
            line = reader.readLine();
        }
        repositoryFile.setUsers(users);

        repositoryFile.delete(5);
        repositoryFile.create(new User(7, "ололош", "алешович", 30, true));
        repositoryFile.update(new User(6, "Инна", "Варшавская", 36, false));
        User user = repositoryFile.findById(2);
        user.setAge(42);
        user.setName("Иван");
        repositoryFile.update(user);
    }
}
