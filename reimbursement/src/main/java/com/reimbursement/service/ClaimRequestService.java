package com.reimbursement.service;

import com.reimbursement.entities.ClaimRequest;
import com.reimbursement.entities.Department;
import com.reimbursement.repository.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClaimRequestService {
  @Autowired
   private ClaimRepository claimRepository;

   public List<ClaimRequest> getAllClaimRequest(){
       List<ClaimRequest> list=new ArrayList();
       list=claimRepository.findAll();
       return list;
   }

   public  ClaimRequest findByID(Long id){
       Optional<ClaimRequest> claimRequestOptional=claimRepository.findById(id);
       return claimRequestOptional.orElse(null);
   }



    public ClaimRequest addClaimRequest(ClaimRequest claimRequest){
       return claimRepository.save(claimRequest);
   }
    }

