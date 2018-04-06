/*
 * Copyright 2014-2018 Groupon, Inc
 * Copyright 2014-2018 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.invoice.plugin.api;

import java.util.List;

import org.joda.time.LocalDate;
import org.killbill.billing.invoice.api.Invoice;
import org.killbill.billing.util.callcontext.CallContext;

public interface InvoiceContext extends CallContext {

    /**
     * @return the target date for that invoice run
     */
    public LocalDate getTargetDate();

    /**
     * @return the invoice that is being / has been created
     */
    public Invoice getInvoice();

    /**
     * @return the existing invoices for this account before that invoice run
     */
    public List<Invoice> getExistingInvoices();

    /**
     * @return if true, the invoice won't be persisted
     */
    public boolean isDryRun();

    /**
     * @return true if this invoice run was rescheduled
     */
    public boolean isRescheduled();
}
