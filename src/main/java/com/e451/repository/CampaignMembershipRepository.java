package com.e451.repository;


import com.e451.model.CampaignMembershipRecord;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignMembershipRepository extends PagingAndSortingRepository<CampaignMembershipRecord, Long> {
}
