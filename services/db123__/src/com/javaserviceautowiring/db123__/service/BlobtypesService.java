/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.javaserviceautowiring.db123__.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.javaserviceautowiring.db123__.Blobtypes;

/**
 * Service object for domain model class {@link Blobtypes}.
 */
public interface BlobtypesService {

    /**
     * Creates a new Blobtypes. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Blobtypes if any.
     *
     * @param blobtypes Details of the Blobtypes to be created; value cannot be null.
     * @return The newly created Blobtypes.
     */
	Blobtypes create(@Valid Blobtypes blobtypes);


	/**
	 * Returns Blobtypes by given id if exists.
	 *
	 * @param blobtypesId The id of the Blobtypes to get; value cannot be null.
	 * @return Blobtypes associated with the given blobtypesId.
     * @throws EntityNotFoundException If no Blobtypes is found.
	 */
	Blobtypes getById(Integer blobtypesId) throws EntityNotFoundException;

    /**
	 * Find and return the Blobtypes by given id if exists, returns null otherwise.
	 *
	 * @param blobtypesId The id of the Blobtypes to get; value cannot be null.
	 * @return Blobtypes associated with the given blobtypesId.
	 */
	Blobtypes findById(Integer blobtypesId);


	/**
	 * Updates the details of an existing Blobtypes. It replaces all fields of the existing Blobtypes with the given blobtypes.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on Blobtypes if any.
     *
	 * @param blobtypes The details of the Blobtypes to be updated; value cannot be null.
	 * @return The updated Blobtypes.
	 * @throws EntityNotFoundException if no Blobtypes is found with given input.
	 */
	Blobtypes update(@Valid Blobtypes blobtypes) throws EntityNotFoundException;

    /**
	 * Deletes an existing Blobtypes with the given id.
	 *
	 * @param blobtypesId The id of the Blobtypes to be deleted; value cannot be null.
	 * @return The deleted Blobtypes.
	 * @throws EntityNotFoundException if no Blobtypes found with the given id.
	 */
	Blobtypes delete(Integer blobtypesId) throws EntityNotFoundException;

	/**
	 * Find all Blobtypes matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Blobtypes.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<Blobtypes> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all Blobtypes matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Blobtypes.
     *
     * @see Pageable
     * @see Page
	 */
    Page<Blobtypes> findAll(String query, Pageable pageable);

    /**
	 * Exports all Blobtypes matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
	 */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the Blobtypes in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the Blobtypes.
	 */
	long count(String query);

	/**
	 * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
	 * @return Paginated data with included fields.

     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
	Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);


}

