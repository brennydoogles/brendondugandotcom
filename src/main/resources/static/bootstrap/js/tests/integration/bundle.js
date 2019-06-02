import 'popper.js'
import $ from 'jquery'
import bootstrap from '../../../../../../../../../../Downloads/bootstrap-4.3.1'

$(() => {
  $('#resultUID').text(bootstrap.Util.getUID('bs'))
  $('[data-toggle="tooltip"]').tooltip()
})
