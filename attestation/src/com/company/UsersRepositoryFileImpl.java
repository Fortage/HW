package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class UsersRepositoryFileImpl {
    List<User> users;

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User findById(int id){
        for(User userUnique: users)
        {
            if (userUnique.getId() == id)
            {
                return userUnique;
            }
        }
        return null;
    }

    public void create(User user)
    {
        checkIdForCreate(user.getId());
        users.add(user);
        writeFile();
    }

    public void update(User user){
        delete(user.getId());
        create(user);
        writeFile();
    }

    public void delete(int id)
    {
        checkIdForDelete(id);
        users.remove(findById(id));
        writeFile();
    }

    private void checkIdForCreate(int id)
    {
        for(User userUnique: users)
        {
            if(userUnique.getId() == id)
            {
                throw new IllegalArgumentException("Пользователь с данным ID существует");
            }
        }
    }

    private void checkIdForDelete(int id)
    {
        boolean flag = false;
        for(User userUnique: users)
        {
            if(userUnique.getId() == id)
            {
                flag = true;
            }
        }
        if(!flag){throw new IllegalArgumentException("Пользователь с данным ID не существует");}
    }

    private void writeFile()
    {
        try(FileWriter writer = new FileWriter("src/com/company/file.txt", false)) {
            for(User user : users)
            {
                writer.write(user.toString());
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
