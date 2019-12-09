package prieto.fernando.data_repository.mapper

import dagger.Reusable
import prieto.fernando.data_repository.model.CompanyInfoRepositoryModel
import prieto.fernando.domain.model.CompanyInfoDomainModel
import javax.inject.Inject

interface CompanyInfoRepositoryToDomainModelMapper {
    fun toDomainModel(companyInfoRepositoryModel: CompanyInfoRepositoryModel): CompanyInfoDomainModel
}

@Reusable
class CompanyInfoRepositoryToDomainModelMapperImpl @Inject constructor() :
    CompanyInfoRepositoryToDomainModelMapper {
    override fun toDomainModel(companyInfoRepositoryModel: CompanyInfoRepositoryModel) =
        CompanyInfoDomainModel(
            name = companyInfoRepositoryModel.name,
            founder = companyInfoRepositoryModel.founder,
            founded = companyInfoRepositoryModel.founded,
            employees = companyInfoRepositoryModel.employees,
            launchSites = companyInfoRepositoryModel.launchSites,
            valuation = companyInfoRepositoryModel.valuation
        )
}
