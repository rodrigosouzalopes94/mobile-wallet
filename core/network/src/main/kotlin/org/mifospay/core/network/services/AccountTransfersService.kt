/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mobile-wallet/blob/master/LICENSE.md
 */
package org.mifospay.core.network.services

import com.mifospay.core.model.entity.accounts.savings.TransferDetail
import org.mifospay.core.network.ApiEndPoints
import retrofit2.http.GET
import retrofit2.http.Path
import rx.Observable

/**
 * Created by ankur on 05/June/2018
 */
interface AccountTransfersService {
    @GET(ApiEndPoints.ACCOUNT_TRANSFER + "/{transferId}")
    fun getAccountTransfer(@Path("transferId") transferId: Long): Observable<TransferDetail>
}
