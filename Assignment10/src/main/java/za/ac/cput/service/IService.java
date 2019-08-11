package za.ac.cput.service;

public interface IService <NameOfRepo, ID> {

    NameOfRepo create(NameOfRepo name);
    NameOfRepo read(ID id);
    NameOfRepo update(NameOfRepo name);
    void delete(ID id);
}