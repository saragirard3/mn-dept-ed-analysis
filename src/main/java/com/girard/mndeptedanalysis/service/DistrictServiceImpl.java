package com.girard.mndeptedanalysis.service;

import com.girard.mndeptedanalysis.entity.District;
import com.girard.mndeptedanalysis.exceptions.DataNotFound;
import com.girard.mndeptedanalysis.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService{
    @Autowired DistrictRepository districtRepository;

    @Override
    public District getDistrictyById(Integer id){
        return districtRepository.findById(id)
            .orElseThrow(()-> new DataNotFound(id));
    }

    @Override
    public List<District> getAllTransactions(){
        return districtRepository.findAll();
    }

//
//    @Autowired
//    TransactionsRepository transactionsRepository;
//
//    @Override
//    public Transactions addTransactions(Transactions transaction) {
//        return transactionsRepository.save(transaction);
//    }
//
//    @Override
//    public List<Transactions> getAllTransactions() {
//        return transactionsRepository.findAll();
//    }
//
//    @Override
//    public Transactions getTransactionById(Integer id) {
//        return transactionsRepository.findById(id)
//                .orElseThrow(()-> new TransactionNotFoundException(id));
//    }
//
//    @Override
//    public String deleteTransaction(Integer id) {
//        if(!transactionsRepository.existsById(id)){
//            throw new TransactionNotFoundException(id);
//        }
//        transactionsRepository.deleteById(id);
//        return "Transaction with id "+id+" has been successfully deleted.";
//    }
//
//    @Override
//    public Transactions updateTransaction(Transactions newTransaction, Integer id) {
//        return transactionsRepository.findById(id)
//                .map(transaction->{
//                    transaction.setAmount(newTransaction.getAmount());
//                    transaction.setCheckNumber(newTransaction.getCheckNumber());
//                    transaction.setComment(newTransaction.getComment());
//                    transaction.setDate(newTransaction.getDate());
//                    transaction.setDescription(newTransaction.getDescription());
//                    return transactionsRepository.save(transaction);
//                }).orElseThrow(()->new TransactionNotFoundException(id));
//    }

}
